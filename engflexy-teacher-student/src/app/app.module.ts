import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {SidebarComponent} from "./layout/sidebar/sidebar.component";
import {NgOptimizedImage} from "@angular/common";
import {AppRoutingModule} from "./app-routing.module";
import {
  NbButtonModule, NbCardModule,
  NbIconModule,
  NbLayoutModule, NbMenuModule,
  NbPopoverModule,
  NbSidebarModule, NbSidebarService,
  NbThemeModule, NbUserModule
} from "@nebular/theme";
import {NbEvaIconsModule} from "@nebular/eva-icons";
import {StudentModule} from "./student/student.module";
import {NavbarComponent} from './layout/navbar/navbar.component';
import {BrowserAnimationsModule, NoopAnimationsModule} from "@angular/platform-browser/animations";

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    NavbarComponent],
  imports: [
    BrowserAnimationsModule,
    NoopAnimationsModule,
    NbThemeModule.forRoot(),
    NbIconModule,
    NbEvaIconsModule,
    StudentModule,
    BrowserModule,
    NgOptimizedImage,
    AppRoutingModule,
    NbLayoutModule,
    NbSidebarModule,
    NbCardModule,
    NbMenuModule.forRoot(),
    NbUserModule
  ],
  providers: [NbSidebarService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
