/* eslint-disable */
import {FuseNavigationItem} from '@fuse/components/navigation';

export const defaultNavigation: FuseNavigationItem[] = [
    {
        id: 'dashboard',
        title: 'Dashboard',
        type: 'basic',
        icon: 'heroicons_outline:chart-pie',
        link: 'student/dashboard'
    }, {
        id: 'my classes',
        title: 'My Classes',
        type: 'basic',
        icon: 'heroicons_outline:briefcase',
        link: 'student/classes'
    }
];
export const studentNavigation: FuseNavigationItem[] = [
    {
        id: 'dashboard',
        title: 'Dashboard',
        type: 'basic',
        icon: 'heroicons_outline:chart-pie',
        link: 'student/dashboard'
    }, {
        id: 'my classes',
        title: 'My Classes',
        type: 'basic',
        icon: 'heroicons_outline:briefcase',
        link: 'student/classes'
    }, {
        id: 'my words',
        title: 'My words',
        type: 'basic',
        icon: 'heroicons_outline:book-open',
        link: 'student/words'
    }, {
        id: 'settings',
        title: 'Settings',
        type: 'basic',
        icon: 'heroicons_outline:cog-6-tooth',
        link: 'student/settings'
    }
];

export const teacherNavigation: FuseNavigationItem[] = [
    {
        id: 'dashboard',
        title: 'Dashboard',
        type: 'basic',
        icon: 'heroicons_outline:chart-pie',
        link: 'teacher/dashboard'
    }
];
