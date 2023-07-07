import {Routes} from '@angular/router';
import {DashboardStudentComponent} from "./dashboard-student/dashboard-student.component";
import {StudentClassesComponent} from "./student-classes/student-classes.component";
import {StudentComponent} from "./student.component";
import {MyWordsComponent} from "./my-words/my-words.component";

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
            },
            {
                path: 'words',
                component: MyWordsComponent,
            },
        ]
    }
] as Routes;
