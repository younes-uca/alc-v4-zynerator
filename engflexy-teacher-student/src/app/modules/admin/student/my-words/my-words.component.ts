import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {NgOptimizedImage} from "@angular/common";
import {MatTabsModule} from "@angular/material/tabs";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatSelectModule} from "@angular/material/select";
import {MatIconModule} from "@angular/material/icon";
import {MatInputModule} from "@angular/material/input";
import {MatButtonModule} from "@angular/material/button";
import {MatCheckboxModule} from "@angular/material/checkbox";
import {MatTooltipModule} from "@angular/material/tooltip";

@Component({
    selector: 'app-my-words',
    templateUrl: './my-words.component.html',
    encapsulation: ViewEncapsulation.None,
    standalone: true,
    imports: [
        NgOptimizedImage,
        MatTabsModule,
        MatFormFieldModule,
        MatSelectModule,
        MatIconModule,
        MatInputModule,
        MatButtonModule,
        MatCheckboxModule,
        MatTooltipModule
    ]
})
export class MyWordsComponent implements OnInit {

    constructor() {
    }

    ngOnInit(): void {
    }

}
