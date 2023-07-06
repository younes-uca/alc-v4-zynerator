import {Routes} from '@angular/router';
import {TeacherComponent} from "./teacher.component";
import {TeacherDashboardComponent} from "./teacher-dashboard/teacher-dashboard.component";

export default [
    {
        path: '',
        component: TeacherComponent,
        children: [
            {
                path: 'dashboard',
                component: TeacherDashboardComponent,
            },]
    }
] as Routes;
