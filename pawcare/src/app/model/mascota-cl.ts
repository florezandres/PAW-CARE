export class MascotaCL {
    public id: number;
    public nombre: string;
    public peso: number;
    public raza: string;
    public enfermedad: string;
    public estado: string;
    public edad: number;
    public imagen: string;

    constructor(id: number, nombre: string, peso: number, raza: string, enfermedad: string, estado: string, edad: number, imagen: string) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.enfermedad = enfermedad;
        this.estado = estado;
        this.edad = edad;
        this.imagen = imagen;
    }
}
