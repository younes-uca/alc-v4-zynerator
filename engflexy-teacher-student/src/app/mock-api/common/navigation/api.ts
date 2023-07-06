import {Injectable} from '@angular/core';
import {FuseNavigationItem} from '@fuse/components/navigation';
import {FuseMockApiService} from '@fuse/lib/mock-api';
import {defaultNavigation, studentNavigation, teacherNavigation} from 'app/mock-api/common/navigation/data';
import {cloneDeep} from 'lodash-es';
import {AuthService} from "../../../core/auth/auth.service";

@Injectable({providedIn: 'root'})
export class NavigationMockApi {
    private readonly _defaultNavigation: FuseNavigationItem[] = defaultNavigation;
    private readonly _studentNavigation: FuseNavigationItem[] = studentNavigation;
    private readonly _teacherNavigation: FuseNavigationItem[] = teacherNavigation;

    /**
     * Constructor
     */
    constructor(private _fuseMockApiService: FuseMockApiService,
                private authService: AuthService
    ) {
        // Register Mock API handlers
        this.registerHandlers();
    }

    // -----------------------------------------------------------------------------------------------------
    // @ Public methods
    // -----------------------------------------------------------------------------------------------------

    /**
     * Register Mock API handlers
     */
    registerHandlers(): void {
        // -----------------------------------------------------------------------------------------------------
        // @ Navigation - GET
        // -----------------------------------------------------------------------------------------------------
        this._fuseMockApiService
            .onGet('api/common/navigation')
            .reply(() => {
                // Fill default navigation using student navigation
                let userRole = this.authService._user?.role;

                // Set the navigation based on the user role
                let navigationItems: FuseNavigationItem[] = [];

                if (userRole === 'STUDENT') {
                    navigationItems = cloneDeep(this._studentNavigation);
                } else if (userRole === 'TEACHER') {
                    navigationItems = cloneDeep(this._teacherNavigation);
                } else {
                    // If the user role is not STUDENT or TEACHER, use the default navigation
                    navigationItems = cloneDeep(this._defaultNavigation);
                }

                // Return the response
                return [
                    200,
                    {
                        default: navigationItems
                    },
                ];
            });
    }
}
