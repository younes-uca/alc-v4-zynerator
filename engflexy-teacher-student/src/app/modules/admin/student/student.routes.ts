import {Routes} from '@angular/router';
import {DashboardStudentComponent} from "./dashboard-student/dashboard-student.component";
import {StudentClassesComponent} from "./student-classes/student-classes.component";
import {StudentComponent} from "./student.component";

export default [
    {
        path: '',
        component: StudentComponent,
        children: [
            {
                path: 'dashboard',
                component: DashboardStudentComponent,
            },
            {
                path: 'classes',
                component: StudentClassesComponent,
            },]
    }
] as Routes;
