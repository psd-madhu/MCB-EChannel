import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable } from 'rxjs';
import { EventSource } from './../model/event-source';
import { Statistics } from 'src/app/model/statistics';

@Injectable({
  providedIn: 'root'
})

export class EchannelVerificationService {

  private getListUrl = 'http://localhost:8080/echannel/list';
  private getEventUrl = 'http://localhost:8080/echannel/get/';

 headers = new Headers();
//const utcOffset = -(new Date().getTimezoneOffset());
// headers.append('Content-Type', 'application/json');
// headers.append('utc-offset', utcOffset.toString());
// headers.append('platform', 'WEB');
// headers.append('app-version', '1.00');
// headers.append('version', '1.0');
// headers.append('accept', 'application/json');
// headers.append('Access-Control-Allow-Origin', '*');
// headers.append('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, PATCH, DELETE');
// headers.append('Access-Control-Allow-Headers', 'X-Requested-With,content-type');
 

  constructor(private http: HttpClient) { }

  getAllEventSourceList(): Observable<EventSource[]> {
    return this.http.get<EventSource[]>(`${this.getListUrl}`);
  }

  getEventSource(businessKey: string): Observable<EventSource> {
    console.log('Inside getEventSource', this.getEventUrl+businessKey);
    return this.http.get<EventSource>('http://localhost:8080/echannel/get/'+businessKey);
  }

  getStatistics(): Observable<any> {
    return this.http.get('http://localhost:8080/echannel/dataByStatus');
  }

  ceateEventSource(eventSource: EventSource): Observable<EventSource> {
    return this.http.post<EventSource>('http://localhost:8080/echannel/create', eventSource);
  }

  updateEventSource(eventSource: EventSource):Observable<EventSource> {
    return this.http.patch<EventSource>('http://localhost:8080/echannel/update/'+eventSource.businessKey, eventSource);
  }
}
