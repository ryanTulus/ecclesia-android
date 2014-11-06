package com.example.ecclesia.viewmodel;

import com.example.ecclesia.R;
import com.example.ecclesia.model.NavDrawerActivityConfiguration;
import com.example.ecclesia.model.NavMenuItem;
import com.example.ecclesia.model.NavMenuSection;
import com.example.ecclesia.model.interfaces.NavDrawerItem;

import android.os.Bundle;

public class MainActivity extends AbstractNavDrawerActivity {
	   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ( savedInstanceState == null ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new HomeFragment()).commit();
        }
    }
   
    @Override
    protected NavDrawerActivityConfiguration getNavDrawerConfiguration() {
       
        NavDrawerItem[] menu = new NavDrawerItem[] {
        		NavMenuSection.create(100, "Ecclesia Mission"),
                NavMenuItem.create(101, "Home", "navdrawer_home", true, this),
//                NavMenuItem.create(102, "Login", "navdrawer_login", true, this),
                NavMenuSection.create(200, "Locations"),
                NavMenuItem.create(201, "Eastern Suburb", "navdrawer_eastern", true, this),
                NavMenuItem.create(202, "Hills", "navdrawer_hills", true, this),
                NavMenuItem.create(203, "North Shore", "navdrawer_north", true, this),
                NavMenuSection.create(300, "Resources"),
                NavMenuItem.create(301, "Teachings", "navdrawer_teaching", true, this),
                NavMenuItem.create(302, "Podcast", "navdrawer_podcast", true, this),
                NavMenuSection.create(400, "About Us"),
                NavMenuItem.create(401, "Statement of Faith", "navdrawer_statement", true, this),
                NavMenuItem.create(402, "Meet the Pastors", "navdrawer_pastors", true, this),
                };
       
        NavDrawerActivityConfiguration navDrawerActivityConfiguration = new NavDrawerActivityConfiguration();
        navDrawerActivityConfiguration.setMainLayout(R.layout.main);
        navDrawerActivityConfiguration.setDrawerLayoutId(R.id.drawer_layout);
        navDrawerActivityConfiguration.setLeftDrawerId(R.id.left_drawer);
        navDrawerActivityConfiguration.setNavItems(menu);
        navDrawerActivityConfiguration.setDrawerShadow(R.drawable.drawer_shadow);      
        navDrawerActivityConfiguration.setDrawerOpenDesc(R.string.drawer_open);
        navDrawerActivityConfiguration.setDrawerCloseDesc(R.string.drawer_close);
        navDrawerActivityConfiguration.setBaseAdapter(
            new NavDrawerAdapter(this, R.layout.navdrawer_item, menu ));
        return navDrawerActivityConfiguration;
    }
   
    @Override
    protected void onNavItemSelected(int id) {
//        switch ((int)id) {
//        case 101:
//            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new FriendMainFragment()).commit();
//            break;
//        case 102:
//            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new AirportFragment()).commit();
//            break;
//        }
    }
}
