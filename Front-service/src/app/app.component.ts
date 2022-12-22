import {Component, OnInit} from '@angular/core';
import {KeycloakSecurityService} from "./service/keycloak-security.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  constructor(public securityService:KeycloakSecurityService) {
  }
  title = 'front';
  ngOnInit(): void {
  }

  onLogout() {
    this.securityService.kc?.logout();
  }


  onLogin() {
    this.securityService.kc?.login();
  }
}
