import { INavbarData } from "./helper";

export const navbarData: INavbarData[] = [
    {
        routeLink: 'HomeMenuComponent',
        icon: 'fal fa-home',
        label: 'Dashboard'
    },
    {
        routeLink: 'HomeMenuComponent',
        icon: 'fal fa-box-open',
        label: 'EChannel Verification',
        items: [
            {
                routeLink: 'VerificationMenuComponent',
                label: 'EChannel Verification Data Menu',
                // items: [
                //     {
                //         routeLink: 'VerificationMenuComponent',
                //         label: 'EChannel Verification Data Menu',
                //     },
                //     {
                //         routeLink: 'StatisticsMenuComponent',
                //         label: 'EChannel Verification Data Menu',
                //     }
                // ]
            },
            {
                routeLink: 'StatisticsMenuComponent',
                label: 'EChannel Verification Data Menu',
            }
        ]
     }
    // {
    //     routeLink: 'statistics',
    //     icon: 'fal fa-chart-bar',
    //     label: 'Statistics'
    // },
    // {
    //     routeLink: 'coupens',
    //     icon: 'fal fa-tags',
    //     label: 'Coupens',
    //     items: [
    //         {
    //             routeLink: 'coupens/list',
    //             label: 'List Coupens'
    //         },
    //         {
    //             routeLink: 'coupens/create',
    //             label: 'Create Coupens'
    //         }
    //     ]
    // },
    // {
    //     routeLink: 'pages',
    //     icon: 'fal fa-file',
    //     label: 'Pages'
    // },
    // {
    //     routeLink: 'media',
    //     icon: 'fal fa-camera',
    //     label: 'Media'
    // },
    // {
    //     routeLink: 'settings',
    //     icon: 'fal fa-cog',
    //     label: 'Settings',
    //     expanded: true,
    //     items: [
    //         {
    //             routeLink: 'settings/profile',
    //             label: 'Profile'
    //         },
    //         {
    //             routeLink: 'settings/customize',
    //             label: 'Customize'
    //         }
    //     ]
    // },
];