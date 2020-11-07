package com.senijoshua.wazzap.config

import android.app.Application
import android.content.Context
import com.getstream.sdk.chat.rest.User
import com.getstream.sdk.chat.rest.core.Client
import com.senijoshua.wazzap.dagger.AppComponent
import com.senijoshua.wazzap.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

const val USER_ID = "empty-queen-5"
private const val USER_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoiZW1wdHk" +
        "tcXVlZW4tNSJ9.RJw-XeaPnUBKbbh71rV1bYAKXp6YaPARh68O08oRnOU"

/**
 *  Application subclass that contains the setup and initialisation of
 *  3rd-party libraries and other components with application scope.
 *
 * @author Seni Joshua
 */
class AppConfig : Application(), HasAndroidInjector {

    @Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>
    @Inject lateinit var chatClient: Client

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        // Initialise the app component here and bind the application instance to it.
        appComponent = DaggerAppComponent.builder().application(this).build()
        // Then initialise field injection in the application class
        appComponent?.initFieldInjection(this)
        initChatClientUser()
    }

    private fun initChatClientUser() {
        val additionalUserFields = HashMap<String, Any>()
        additionalUserFields["name"] = "Mando Lorian"
        additionalUserFields["image"] = "https://bit.ly/2TIt8NR"
        chatClient.setUser(User(USER_ID, additionalUserFields), USER_TOKEN)
    }

    /**
     * Returns the injected Android Injector from dagger that will be used
     * for performing field injection in Android framework classes within this app
     */
    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    companion object {
        var appInstance: Application? = null
        var appComponent: AppComponent? = null
        var applicationContext: Context? = appInstance?.applicationContext
    }
}
