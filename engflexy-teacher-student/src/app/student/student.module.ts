import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {StudentRoutingModule} from './student-routing.module';
import {DashboardComponent} from "./dashboard/dashboard.component";
import {NbButtonModule, NbCardModule, NbLayoutModule, NbSelectModule, NbUserModule} from "@nebular/theme";


@NgModule({
  declarations: [DashboardComponent
  ],
    imports: [
        CommonModule,
        StudentRoutingModule,
        NbButtonModule,
        NbCardModule,
        NbSelectModule,
        NbLayoutModule,
        NbUserModule
    ]
})
export class StudentModule {
}
