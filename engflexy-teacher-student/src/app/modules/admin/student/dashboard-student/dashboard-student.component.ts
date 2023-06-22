import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {NgFor} from "@angular/common";
import {trigger} from "@angular/animations";
import {MatIconModule} from "@angular/material/icon";

@Component({
    selector: 'app-dashboard-student',
    standalone: true,
    templateUrl: './dashboard-student.component.html',
    encapsulation: ViewEncapsulation.None,
    imports: [NgFor, MatIconModule]
})
export class DashboardStudentComponent implements OnInit {
    state = true;
    stats = [
        {
            data: "30",
            desc: "All Lessons"
        },
        {
            data: "15",
            desc: "Completed Lessons"
        },
        {
            data: "15",
            desc: "Lessons Coming"
        }
    ]

    constructor() {
    }


    ngOnInit(): void {
        this.state = true;
    }
}
