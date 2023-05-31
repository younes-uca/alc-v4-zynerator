import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {SidebarComponent} from "./layout/sidebar/sidebar.component";
import {NgOptimizedImage} from "@angular/common";
import {AppRoutingModule} from "./app-routing.module";
import {NbButtonModule, NbIconModule, NbPopoverModule, NbThemeModule} from "@nebular/theme";
import {NbEvaIconsModule} from "@nebular/eva-icons";

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent],
  imports: [
    NbThemeModule.forRoot(),
    NbIconModule,
    NbEvaIconsModule,
    BrowserModule,
    NgOptimizedImage,
    NbButtonModule,
    AppRoutingModule,
    NbPopoverModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
