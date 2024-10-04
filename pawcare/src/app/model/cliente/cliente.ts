import { OperatorFunction } from "rxjs";
import { mascota } from "../mascota/mascota";

export interface cliente {
    mascotas: any;
    id: number;
    nombre: string;
    correo: string;
    cedula: number;
    celular: number;
}