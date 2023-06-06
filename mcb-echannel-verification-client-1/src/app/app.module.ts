import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/common/header/header.component';
import { FooterComponent } from './components/common/footer/footer.component';
import { HomeMenuComponent } from './components/e-channel/home-menu/home-menu.component';
import { VerificationMenuComponent } from './components/e-channel/verification-menu/verification-menu.component';
import { StatisticsMenuComponent } from './components/e-channel/statistics-menu/statistics-menu.component';
import { SideBarComponent } from './components/common/side-bar/side-bar.component';
import { EchannelVerificationService } from './services/verification.service';
import { FormsModule, ReactiveFormsModule, FormGroup, FormControl } from '@angular/forms';
// import { DataTablesModule } from 'angular-datatables';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeMenuComponent,
    VerificationMenuComponent,
    StatisticsMenuComponent,
    SideBarComponent
    // DataTablesModule
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [EchannelVerificationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
