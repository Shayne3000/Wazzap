package com.senijoshua.wazzap.dagger

import com.senijoshua.wazzap.utils.annotations.ApplicationScope
import dagger.Component

/**
 * Application component responsible for injecting application scope dependencies
 *
 * @author Seni Joshua
 */
@Component
@ApplicationScope
interface AppComponent {
}
