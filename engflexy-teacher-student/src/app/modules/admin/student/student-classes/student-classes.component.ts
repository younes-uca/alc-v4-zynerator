import {Component, ViewEncapsulation} from '@angular/core';
import {MatIconModule} from "@angular/material/icon";

@Component({
    selector: 'app-student-classes',
    templateUrl: './student-classes.component.html',
    standalone: true,
    encapsulation: ViewEncapsulation.None,
    imports: [
        MatIconModule
    ]
})
export class StudentClassesComponent {
    constructor() {
    }
}
