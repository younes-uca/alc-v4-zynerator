import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {NewsService} from 'src/app/controller/service/News.service';
import {NewsDto} from 'src/app/controller/model/News.model';
import {NewsCriteria} from 'src/app/controller/criteria/NewsCriteria.model';



@Component({
  selector: 'app-news-edit-admin',
  templateUrl: './news-edit-admin.component.html'
})
export class NewsEditAdminComponent extends AbstractEditController<NewsDto, NewsCriteria, NewsService>   implements OnInit {


    private _validNewsRef = true;




    constructor( private newsService: NewsService ) {
        super(newsService);
    }

    ngOnInit(): void {
}
    public prepareEdit() {
        this.item.dateNews = this.newsService.format(this.item.dateNews);
        this.item.dateDebut = this.newsService.format(this.item.dateDebut);
        this.item.dateFin = this.newsService.format(this.item.dateFin);
    }



    public setValidation(value : boolean){
        this.validNewsRef = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateNewsRef();
    }
    public validateNewsRef(){
        if (this.stringUtilService.isEmpty(this.item.ref)) {
            this.errorMessages.push('Ref non valide');
            this.validNewsRef = false;
        } else {
            this.validNewsRef = true;
        }
    }






    get validNewsRef(): boolean {
        return this._validNewsRef;
    }
    set validNewsRef(value: boolean) {
        this._validNewsRef = value;
    }

}
