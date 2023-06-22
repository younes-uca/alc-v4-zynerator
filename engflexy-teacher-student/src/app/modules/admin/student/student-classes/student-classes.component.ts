import {CdkScrollable} from '@angular/cdk/scrolling';
import {I18nPluralPipe, NgClass, NgFor, NgIf, PercentPipe} from '@angular/common';
import {ChangeDetectionStrategy, Component, OnDestroy, OnInit, ViewEncapsulation} from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {MatOptionModule} from '@angular/material/core';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatSelectModule} from '@angular/material/select';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatTooltipModule} from '@angular/material/tooltip';
import {RouterLink} from '@angular/router';
import {FuseFindByKeyPipe} from '@fuse/pipes/find-by-key/find-by-key.pipe';


@Component({
    selector: 'app-student-classes',
    templateUrl: './student-classes.component.html',
    encapsulation: ViewEncapsulation.None,
    changeDetection: ChangeDetectionStrategy.OnPush,
    standalone: true,
    imports: [CdkScrollable, MatFormFieldModule, MatSelectModule, MatOptionModule, NgFor, MatIconModule, MatInputModule, MatSlideToggleModule, NgIf, NgClass, MatTooltipModule, MatProgressBarModule, MatButtonModule, RouterLink, FuseFindByKeyPipe, PercentPipe, I18nPluralPipe],

})
export class StudentClassesComponent implements OnInit, OnDestroy {
    showLessons = true;
    category: string = 'ELEMENTARY';

    constructor() {
    }

    ngOnDestroy(): void {
    }

    ngOnInit(): void {
    }

}
