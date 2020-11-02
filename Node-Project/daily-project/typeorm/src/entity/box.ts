import {Entity, PrimaryGeneratedColumn, Column} from "typeorm";

@Entity('boxes')
export class Box {

    @PrimaryGeneratedColumn()
    id: number;

    @Column({name:'code'})
    code: string;

    @Column({name:'company_id'})
    companyId: string;

    @Column({name:'name'})
    name: string;

}
