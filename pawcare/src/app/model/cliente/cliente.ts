import { OperatorFunction } from "rxjs";
import { mascota } from "../mascota/mascota";

export interface cliente {
    id: number;
    nombre: string;
    correo: string;
    cedula: number;
    celular: number;
    mascotas?: mascota[];
}