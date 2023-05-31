import {Component} from '@angular/core';
import {NbSidebarState, NbThemeService} from "@nebular/theme";
import {AppComponent} from "../../app.component";
import {LayoutService} from "../layout.service";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  isDarkTheme: boolean = false

  constructor(private themeService: NbThemeService,
              private layout: LayoutService,
              public appComponent: AppComponent) {
  }


  get state(): NbSidebarState {
    return this.layout.state;
  }

  set state(value: NbSidebarState) {
    this.layout.state = value;
  }


  setState() {
    if (this.state === 'expanded') {
      this.state = 'collapsed';
    } else if (this.state === 'collapsed') {
      this.state = 'compacted';
    } else {
      this.state = 'expanded';
    }
  }

  toggleTheme() {
    this.isDarkTheme = this.themeService.currentTheme === 'dark';
    const theme = this.isDarkTheme ? 'default' : 'dark';
    this.themeService.changeTheme(theme);
    this.appComponent.is_dark = !this.appComponent.is_dark;
  }
}
