import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  // selector: '[app-servers]',
  // selector: '.app-servers',
  // template:
  // `<app-server></app-server>
  // <app-server></app-server>`,
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allowNewServer:boolean = false;
  serverCreationStatus:string = 'No server for creation';
  servername = '';
  username ='';
  servernamedisplay: boolean = false;
  servers = ['server1'];

  constructor() {
   setTimeout(() => {
    this.allowNewServer = true;
   }, 2000)
  }

  serverCreator(){
    this.servers.push(this.servername);
    this.servernamedisplay = true;
    this.serverCreationStatus = 'Server was created' + 'name is ' + this.servername;
  }

  updateServerName(event: Event) {

    this.servername = (<HTMLInputElement>event.target).value;
  }

  ngOnInit(): void {
  }

}
