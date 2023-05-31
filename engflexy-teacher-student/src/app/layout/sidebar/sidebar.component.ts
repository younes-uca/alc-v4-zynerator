import {Component, OnInit} from '@angular/core';
import {NbMenuItem, NbSidebarState, NbThemeService} from "@nebular/theme";
import {AppComponent} from "../../app.component";
import {LayoutService} from "../layout.service";

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {
  items: NbMenuItem[] = [

    {
      title: 'Dashboard',
      link: 'student/dashboard',
      icon: 'home'
    },
    {
      title: 'Schedule',
      link: 'student/dashboard',
      icon: 'calendar'
    },
    {
      title: 'Profile',
      link: 'student/dashboard',
      icon: 'person'
    },
    {
      title: 'Settings',
      link: 'student/dashboard',
      icon: 'settings-2'
    },
    {
      title: 'Logout',
      link: '/logout',
      icon: 'log-out'
    },
  ];


  ngOnInit(): void {
  }

}
