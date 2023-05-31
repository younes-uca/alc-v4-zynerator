import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {
  showDropDown: boolean = false;
  routes: any = [
    {
      link: '/',
      icon: 'home',
      name: 'Dashboard'
    },
    {
      link: '/schedule',
      icon: 'calendar',
      name: 'Schedule'
    },
    {
      link: '/logout',
      icon: 'log-out',
      name: 'Logout'
    },
  ];

  ngOnInit(): void {
  }

}
