import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [
  {
    path: '',
    children: [
      {
        path: 'student',
        loadChildren: () => import( './student/student.module').then(x => x.StudentModule),
        // canActivate: [AuthGuard],
      },
      {
        path: 'teacher',
        loadChildren: () => import( './teacher/teacher/teacher.module').then(x => x.TeacherModule),
        // canActivate: [AuthGuard],
      },
    ],
    // canActivate: [AuthGuard]
  },
  {
    path: '**',
    redirectTo: '/not-found' //Error 404 - Page not found
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
