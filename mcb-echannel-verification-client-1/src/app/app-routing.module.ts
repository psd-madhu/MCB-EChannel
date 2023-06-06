import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeMenuComponent } from './components/e-channel/home-menu/home-menu.component';
import { StatisticsMenuComponent } from './components/e-channel/statistics-menu/statistics-menu.component';
import { VerificationMenuComponent } from './components/e-channel/verification-menu/verification-menu.component';

const routes: Routes = [
  {path: '', component: HomeMenuComponent },
  {path: 'home', component: HomeMenuComponent },
  {path: 'verification/:businessKey', component: VerificationMenuComponent},
  {path: 'list', component: StatisticsMenuComponent}
 // {path: '**', component: ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
