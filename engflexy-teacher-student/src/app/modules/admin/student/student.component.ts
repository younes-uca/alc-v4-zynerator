import {Component, ViewEncapsulation} from '@angular/core';
import {Router, RouterOutlet} from "@angular/router";

@Component({
    selector: 'app-student',
    templateUrl: './student.component.html',
    standalone: true,
    encapsulation: ViewEncapsulation.None,
    imports: [
        RouterOutlet
    ]
})
export class StudentComponent {
    constructor(private router: Router) {
        // this.router.navigate(['/student/dashboard'])
    }
}
