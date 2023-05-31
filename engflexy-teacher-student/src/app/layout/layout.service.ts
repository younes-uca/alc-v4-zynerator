import {Injectable} from '@angular/core';
import {NbSidebarState} from "@nebular/theme";

@Injectable({
  providedIn: 'root'
})
export class LayoutService {
  private _state: NbSidebarState = 'expanded' || 'collapsed' || 'compacted'

  constructor() {
  }


  get state(): NbSidebarState {
    return this._state;
  }


  set state(value: NbSidebarState) {
    this._state = value;
  }
}
