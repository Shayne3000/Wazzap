package com.senijoshua.wazzap.presentation.home

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.senijoshua.wazzap.R
import com.senijoshua.wazzap.presentation.home.calls.CallsFragment
import com.senijoshua.wazzap.presentation.home.chatlist.ConversationListFragment
import com.senijoshua.wazzap.presentation.home.status.StatusFragment
import com.senijoshua.wazzap.presentation.root.WazzapActivity
import com.senijoshua.wazzap.presentation.root.WazzapFragment
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

private const val TAB_COUNT = 4

/**
 * Fragment that is the first point of entry into the app and holds all the primary fragments
 * in a Viewpager.
 *
 * @author Seni Joshua
 */
class HomeFragment : WazzapFragment(R.layout.fragment_home) {
    @Inject lateinit var viewModel: HomeViewModel

    val rootActivity: WazzapActivity by lazy {
        activity as WazzapActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        // Denotes that the fragment participates in options menu handling
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_fragment_home, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        rootActivity.setSupportActionBar(home_toolbar)

        // TODO Assign the pager adapter to the View Pager

        // TODO Connect the tab layout to the ViewPager using the TabsLayoutMediator
    }
}

class HomeViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = TAB_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> ConversationListFragment()

            2 -> StatusFragment()

            3 -> CallsFragment()

            else -> StatusFragment()
        }
    }
}
