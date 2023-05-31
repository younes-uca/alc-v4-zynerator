import {Component} from '@angular/core';
import {LayoutService} from "./layout/layout.service";
import {NbSidebarState} from "@nebular/theme";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  is_dark: boolean = false;

  constructor(private layout: LayoutService) {
  }

  get state(): NbSidebarState {
    return this.layout.state;
  }

  set state(value: NbSidebarState) {
    this.layout.state = value;
  }
}
