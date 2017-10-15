package com.abdulmujibaliu.koutube.fragments

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abdulmujibaliu.koutube.R
import com.abdulmujibaliu.koutube.tabsadapter.VideoTabsAdapter
import kotlinx.android.synthetic.main.fragment_library_tabs.*

/**
 * A placeholder fragment containing a simple view.
 */
class LibraryTabsActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_library_tabs, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val videoTabsAdapter = VideoTabsAdapter(childFragmentManager)
        toolbar.setTitle("Kutube")
        toolbar.setTitleTextColor(activity.resources.getColor(R.color.abc_btn_colored_text_material))
        container.adapter = videoTabsAdapter


        tabs.setupWithViewPager(container)

    }
}