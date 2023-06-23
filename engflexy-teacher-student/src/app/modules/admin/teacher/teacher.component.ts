import {Component, ViewEncapsulation} from '@angular/core';
import {RouterOutlet} from "@angular/router";

@Component({
    selector: 'app-teacher',
    templateUrl: './teacher.component.html',
    standalone: true,
    encapsulation: ViewEncapsulation.None,
    imports: [
        RouterOutlet
    ]
})
export class TeacherComponent {
    constructor() {
    }
}
