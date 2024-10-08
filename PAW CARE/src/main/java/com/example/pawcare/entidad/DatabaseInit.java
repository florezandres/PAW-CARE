
package com.example.pawcare.entidad;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.example.pawcare.repositorio.AdministradorRepository;
import com.example.pawcare.repositorio.ClienteRepository;
import com.example.pawcare.repositorio.DrogaRepository;
import com.example.pawcare.repositorio.MascotaRepository;
import com.example.pawcare.repositorio.TratamientoRepository;
import com.example.pawcare.repositorio.VeterinarioRepository;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    MascotaRepository mascotaRepository;

    @Autowired
    AdministradorRepository administradorRepository;

    @Autowired
    VeterinarioRepository veterinarioRepository;

    @Autowired
    DrogaRepository drogaRepository;

    @Autowired
    TratamientoRepository tratamientoRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        
        //Admin
        administradorRepository.save(new Administrador(777));

        //Clientes
        clienteRepository.save(new Cliente("Juan Pérez", "juan.perez@example.com", 12345678, 87654321));
        clienteRepository.save(new Cliente("María Gómez", "maria.gomez@example.com", 23456789, 98765432));
        clienteRepository.save(new Cliente("Carlos López", "carlos.lopez@example.com", 34567890, 19876543));
        clienteRepository.save(new Cliente("Ana Martínez", "ana.martinez@example.com", 45678901, 21987654));
        clienteRepository.save(new Cliente("Luis Rodríguez", "luis.rodriguez@example.com", 56789012, 32198765));
        clienteRepository.save(new Cliente("Laura Fernández", "laura.fernandez@example.com", 67890123, 43219876));
        clienteRepository.save(new Cliente("Pedro Ramírez", "pedro.ramirez@example.com", 78901234, 54321987));
        clienteRepository.save(new Cliente("Lucía Sánchez", "lucia.sanchez@example.com", 89012345, 65432198));
        clienteRepository.save(new Cliente("Miguel Torres", "miguel.torres@example.com", 90123456, 76543219));
        clienteRepository.save(new Cliente("Andrea Morales", "andrea.morales@example.com", 12345679, 87654320));
        clienteRepository.save(new Cliente("Santiago Ortiz", "santiago.ortiz@example.com", 23456780, 98765421));
        clienteRepository.save(new Cliente("Isabella Herrera", "isabella.herrera@example.com", 34567891, 19876542));
        clienteRepository.save(new Cliente("Daniel Vargas", "daniel.vargas@example.com", 45678902, 21987653));
        clienteRepository.save(new Cliente("Valentina Ríos", "valentina.rios@example.com", 56789013, 32198764));
        clienteRepository.save(new Cliente("Sebastián Castro", "sebastian.castro@example.com", 67890124, 43219875));
        clienteRepository.save(new Cliente("Camila Mendoza", "camila.mendoza@example.com", 78901235, 54321986));
        clienteRepository.save(new Cliente("Mateo Jiménez", "mateo.jimenez@example.com", 89012346, 65432197));
        clienteRepository.save(new Cliente("Sofía Romero", "sofia.romero@example.com", 90123457, 76543210));
        clienteRepository.save(new Cliente("Nicolás Vargas", "nicolas.vargas@example.com", 12345680, 87654322));
        clienteRepository.save(new Cliente("Gabriela Pineda", "gabriela.pineda@example.com", 23456781, 98765433));
        clienteRepository.save(new Cliente("Diego Suárez", "diego.suarez@example.com", 34567892, 19876544));
        clienteRepository.save(new Cliente("Valeria Rivera", "valeria.rivera@example.com", 45678903, 21987655));
        clienteRepository.save(new Cliente("Martín Gutiérrez", "martin.gutierrez@example.com", 56789014, 32198766));
        clienteRepository.save(new Cliente("Mariana Castillo", "mariana.castillo@example.com", 67890125, 43219877));
        clienteRepository.save(new Cliente("Lucas Silva", "lucas.silva@example.com", 78901236, 54321988));
        clienteRepository.save(new Cliente("Antonella Vargas", "antonella.vargas@example.com", 89012347, 65432199));
        clienteRepository.save(new Cliente("Tomás Díaz", "tomas.diaz@example.com", 90123458, 76543211));
        clienteRepository.save(new Cliente("Julieta Reyes", "julieta.reyes@example.com", 12345681, 87654323));
        clienteRepository.save(new Cliente("David Moreno", "david.moreno@example.com", 23456782, 98765434));
        clienteRepository.save(new Cliente("Paula Soto", "paula.soto@example.com", 34567893, 19876545));
        clienteRepository.save(new Cliente("Joaquín Rojas", "joaquin.rojas@example.com", 45678904, 21987656));
        clienteRepository.save(new Cliente("Catalina Álvarez", "catalina.alvarez@example.com", 56789015, 32198767));
        clienteRepository.save(new Cliente("Emiliano Ruiz", "emiliano.ruiz@example.com", 67890126, 43219878));
        clienteRepository.save(new Cliente("Valentina Ramírez", "valentina.ramirez@example.com", 78901237, 54321989));
        clienteRepository.save(new Cliente("Pablo Acosta", "pablo.acosta@example.com", 89012348, 65432100));
        clienteRepository.save(new Cliente("Emilia Luna", "emilia.luna@example.com", 90123459, 76543212));
        clienteRepository.save(new Cliente("Agustín Pérez", "agustin.perez@example.com", 12345682, 87654324));
        clienteRepository.save(new Cliente("Mía Gómez", "mia.gomez@example.com", 23456783, 98765435));
        clienteRepository.save(new Cliente("Alejandro Torres", "alejandro.torres@example.com", 34567894, 19876546));
        clienteRepository.save(new Cliente("Victoria Ortiz", "victoria.ortiz@example.com", 45678905, 21987657));
        clienteRepository.save(new Cliente("Iván Gutiérrez", "ivan.gutierrez@example.com", 56789016, 32198768));
        clienteRepository.save(new Cliente("Renata Vargas", "renata.vargas@example.com", 67890127, 43219879));
        clienteRepository.save(new Cliente("Bruno Morales", "bruno.morales@example.com", 78901238, 54321990));
        clienteRepository.save(new Cliente("Natalia Rivera", "natalia.rivera@example.com", 89012349, 65432101));
        clienteRepository.save(new Cliente("Facundo Herrera", "facundo.herrera@example.com", 90123460, 76543213));
        clienteRepository.save(new Cliente("Amanda Sánchez", "amanda.sanchez@example.com", 12345683, 87654325));
        clienteRepository.save(new Cliente("Benjamín Ramírez", "benjamin.ramirez@example.com", 23456784, 98765436));
        clienteRepository.save(new Cliente("Florencia Pineda", "florencia.pineda@example.com", 34567895, 19876547));
        clienteRepository.save(new Cliente("Luciano Jiménez", "luciano.jimenez@example.com", 45678906, 21987658));
        clienteRepository.save(new Cliente("Martina Castillo", "martina.castillo@example.com", 56789017, 32198769));
        
        //Mascotas
        mascotaRepository.save(new Mascota("Lucas", "15", "Labrador", "Displasia de cadera", "En tratamiento", 5, "assets/img/lucas.jpg"));
        mascotaRepository.save(new Mascota("Pablo", "1", "Desconocida", "Otitis", "Recuperado", 3, "assets/img/pablo.jpg"));
        mascotaRepository.save(new Mascota("Jhony", "25", "Criollo", "Artritis", "En tratamiento", 7, "assets/img/jhony.jpg"));
        mascotaRepository.save(new Mascota("Miguel", "30", "Husky", "Alergia alimentaria", "En tratamiento", 4, "assets/img/miguel.jpg"));
        mascotaRepository.save(new Mascota("Zeus", "4", "Pastor Aleman", "Problemas dentales", "Recuperado", 2, "assets/img/Zeus.jpg"));
        mascotaRepository.save(new Mascota("Coco", "4", "Pastor Aleman", "Problemas dentales", "Recuperado", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Max", "5", "Labrador", "Corte de orejas", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bella", "6", "Beagle", "Raspaduras", "En tratamiento", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Charlie", "7", "Bulldog", "Ojos irritados", "En observación", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "4", "Poodle", "Infección en la piel", "Recuperado", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lucy", "3", "Chihuahua", "Problemas respiratorios", "En tratamiento", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Molly", "8", "Boxer", "Cojera", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "9", "Rottweiler", "Diarrea", "En observación", 6, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sadie", "5", "Dachshund", "Corte en la pata", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Buddy", "4", "Cocker Spaniel", "Fiebre", "Recuperado", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "6", "Schnauzer", "Tos persistente", "En observación", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Toby", "7", "Pug", "Problemas de digestión", "En tratamiento", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jake", "3", "Shih Tzu", "Alergias", "Recuperado", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lola", "5", "Pomerania", "Raspaduras en la piel", "En observación", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bentley", "8", "Husky", "Dolores de estómago", "En tratamiento", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Duke", "9", "Akita", "Infección ocular", "Recuperado", 6, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oliver", "4", "Bichon Frise", "Herida en la pata", "En observación", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Chloe", "6", "Yorkshire Terrier", "Problemas de oído", "En tratamiento", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bear", "7", "Bernese Mountain Dog", "Infección urinaria", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "5", "Samoyedo", "Dolores musculares", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sophie", "8", "Golden Retriever", "Alergias alimentarias", "En tratamiento", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jack", "3", "Cavalier King Charles", "Problemas dentales", "Recuperado", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luna", "5", "Maltés", "Lesión en la cola", "En observación", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zoey", "6", "Pug", "Infección en las encías", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Mia", "7", "Dálmata", "Cortes menores", "Recuperado", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Loki", "8", "Weimaraner", "Problemas de piel", "En observación", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Gracie", "4", "Basset Hound", "Infección respiratoria", "En tratamiento", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rusty", "5", "Labrador", "Problemas articulares", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Harley", "6", "Terrier", "Problemas digestivos", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Misty", "7", "Beagle", "Herida en la pata", "En tratamiento", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oscar", "4", "Schnauzer", "Corte en la oreja", "Recuperado", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jasper", "8", "Boxer", "Fiebre alta", "En observación", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Penny", "5", "Pomerania", "Problemas oculares", "En tratamiento", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bailey", "6", "Cocker Spaniel", "Alergia estacional", "Recuperado", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maya", "7", "Poodle", "Dolores en el estómago", "En observación", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Winston", "4", "Husky", "Problemas dentales", "En tratamiento", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Roxy", "5", "Akita", "Corte en la pata", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lola", "8", "Mastín", "Fiebre leve", "En observación", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "6", "Shih Tzu", "Infección en el oído", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "7", "Dachshund", "Problemas en la piel", "Recuperado", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Ellie", "4", "Yorkshire Terrier", "Corte en la cola", "En observación", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sasha", "5", "Labrador", "Herida en el ojo", "En tratamiento", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "6", "Beagle", "Problemas respiratorios", "Recuperado", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Nala", "7", "Boxer", "Raspaduras menores", "En observación", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Milo", "5", "Schnauzer", "Infección en la piel", "En tratamiento", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zeke", "8", "Pug", "Dolores en las patas", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Stella", "6", "Pomerania", "Corte en la oreja", "En observación", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luca", "7", "Chihuahua", "Problemas de visión", "En tratamiento", 2, "assets/img/perroGenerico.png"));        
        mascotaRepository.save(new Mascota("Luca", "7", "Chihuahua", "Problemas de visión", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "4", "Shih Tzu", "Herida en la pata", "Recuperado", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jax", "6", "Rottweiler", "Infección en el oído", "En observación", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Mia", "7", "Maltés", "Corte en la cola", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Leo", "5", "Labrador", "Problemas articulares", "Recuperado", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luna", "8", "Beagle", "Fiebre leve", "En observación", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sasha", "4", "Cocker Spaniel", "Infección respiratoria", "En tratamiento", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Buddy", "6", "Poodle", "Dolores musculares", "Recuperado", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Roxy", "7", "Akita", "Problemas dentales", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "5", "Dachshund", "Corte en la pata", "En tratamiento", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oliver", "6", "Schnauzer", "Alergias estacionales", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Chloe", "8", "Pomerania", "Problemas oculares", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "5", "Pug", "Dolores de estómago", "En tratamiento", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bailey", "7", "Labrador", "Herida en el ojo", "Recuperado", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zara", "4", "Beagle", "Corte en la pata", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Toby", "5", "Bulldog", "Problemas dentales", "En tratamiento", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Nina", "6", "Boxer", "Fiebre alta", "Recuperado", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Dexter", "7", "Pomerania", "Raspaduras menores", "En observación", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Winnie", "8", "Rottweiler", "Infección urinaria", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Milo", "4", "Chihuahua", "Problemas digestivos", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rosie", "6", "Cocker Spaniel", "Herida en la cola", "En observación", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jasper", "7", "Schnauzer", "Corte en la oreja", "En tratamiento", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lola", "5", "Shih Tzu", "Infección en la piel", "Recuperado", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "8", "Pug", "Problemas oculares", "En observación", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Benny", "4", "Labrador", "Corte en la pata", "En tratamiento", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "6", "Dachshund", "Fiebre baja", "Recuperado", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "7", "Beagle", "Infección respiratoria", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bella", "5", "Boxer", "Herida en la pata", "En tratamiento", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luna", "8", "Poodle", "Problemas articulares", "Recuperado", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jack", "4", "Cocker Spaniel", "Dolores de estómago", "En observación", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zoey", "6", "Schnauzer", "Infección en el ojo", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Milo", "7", "Pomerania", "Problemas dentales", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Ruby", "5", "Labrador", "Fiebre leve", "En observación", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Max", "8", "Bulldog", "Corte en la pata", "En tratamiento", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sadie", "4", "Chihuahua", "Problemas de piel", "Recuperado", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oliver", "6", "Beagle", "Infección en las encías", "En observación", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "7", "Rottweiler", "Dolores musculares", "En tratamiento", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "5", "Pug", "Corte en la cola", "Recuperado", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Chloe", "8", "Akita", "Problemas digestivos", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bailey", "4", "Dachshund", "Herida en el ojo", "En tratamiento", 5, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sophie", "6", "Boxer", "Infección respiratoria", "Recuperado", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bella", "7", "Poodle", "Problemas articulares", "En observación", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Toby", "5", "Shih Tzu", "Dolores en el estómago", "En tratamiento", 4, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "6", "Labrador", "Herida en la pata", "Recuperado", 1, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Roxy", "8", "Cocker Spaniel", "Fiebre baja", "En observación", 3, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Nina", "4", "Pug", "Infección en el ojo", "En tratamiento", 2, "assets/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "5", "Dachshund", "Problemas dentales", "Recuperado", 4, "assets/img/perroGenerico.png"));

        //Veterinarios
        veterinarioRepository.save(new Veterinario("Dr. House", 998888888, "Tratamientos Oculares", "assets/img/veterinarioGenerico.png", 3));
        veterinarioRepository.save(new Veterinario("Dra. Lisa Cuddy", 998888889, "Medicina Interna", "assets/img/veterinarioGenerico.png", 5));
        veterinarioRepository.save(new Veterinario("Dr. James Wilson", 998888890, "Oncología", "assets/img/veterinarioGenerico.png", 4));
        veterinarioRepository.save(new Veterinario("Dr. Robert Chase", 998888891, "Cirugía", "assets/img/veterinarioGenerico.png", 7));
        veterinarioRepository.save(new Veterinario("Dra. Allison Cameron", 998888892, "Diagnóstico General", "assets/img/veterinarioGenerico.png", 6));
        veterinarioRepository.save(new Veterinario("Dr. Eric Foreman", 998888893, "Neurología", "assets/img/veterinarioGenerico.png", 8));
        veterinarioRepository.save(new Veterinario("Dr. Chris Taub", 998888894, "Cardiología", "assets/img/veterinarioGenerico.png", 5));
        veterinarioRepository.save(new Veterinario("Dra. Remy Hadley", 998888895, "Genética", "assets/img/veterinarioGenerico.png", 3));
        veterinarioRepository.save(new Veterinario("Dr. Lawrence Kutner", 998888896, "Psiquiatría", "assets/img/veterinarioGenerico.png", 4));
        veterinarioRepository.save(new Veterinario("Dr. Jeffrey Cole", 998888897, "Medicina General", "assets/img/veterinarioGenerico.png", 2));
        veterinarioRepository.save(new Veterinario("Dr. Henry Dobson", 998888898, "Dermatología", "assets/img/veterinarioGenerico.png", 6));
        veterinarioRepository.save(new Veterinario("Dra. Amber Volakis", 998888899, "Anestesiología", "assets/img/veterinarioGenerico.png", 3));
        veterinarioRepository.save(new Veterinario("Dra. Jessica Adams", 998888900, "Medicina de Urgencias", "assets/img/veterinarioGenerico.png", 4));
        veterinarioRepository.save(new Veterinario("Dra. Chi Park", 998888901, "Neurocirugía", "assets/img/veterinarioGenerico.png", 5));
        veterinarioRepository.save(new Veterinario("Dr. Gregory House", 998888902, "Nefrología", "assets/img/veterinarioGenerico.png", 9));
        veterinarioRepository.save(new Veterinario("Dr. John Carter", 998888903, "Infectología", "assets/img/veterinarioGenerico.png", 7));
        veterinarioRepository.save(new Veterinario("Dr. Peter Benton", 998888904, "Gastroenterología", "assets/img/veterinarioGenerico.png", 8));
        veterinarioRepository.save(new Veterinario("Dra. Susan Lewis", 998888905, "Reumatología", "assets/img/veterinarioGenerico.png", 3));
        veterinarioRepository.save(new Veterinario("Dr. Mark Greene", 998888906, "Pediatría", "assets/img/veterinarioGenerico.png", 6));
        veterinarioRepository.save(new Veterinario("Dr. James Johnson", 998888907, "Cirugía Plastica", "assets/img/veterinarioGenerico.png", 7));        
        
        //Tratamientos
        tratamientoRepository.save(new Tratamiento("10/20/2024", "Desparasitación interna y externa"));
        tratamientoRepository.save(new Tratamiento("10/21/2024", "Vacunación contra la rabia"));
        tratamientoRepository.save(new Tratamiento("10/22/2024", "Limpieza dental y pulido"));
        tratamientoRepository.save(new Tratamiento("10/23/2024", "Aplicación de antipulgas y garrapatas"));
        tratamientoRepository.save(new Tratamiento("10/20/2024", "Tratamiento para infecciones oculares"));
        tratamientoRepository.save(new Tratamiento("10/24/2024", "Tratamiento para problemas de piel"));
        tratamientoRepository.save(new Tratamiento("10/21/2024", "Control de peso y dieta"));
        tratamientoRepository.save(new Tratamiento("10/22/2024", "Cirugía de esterilización"));
        tratamientoRepository.save(new Tratamiento("10/23/2024", "Tratamiento para artritis"));
        tratamientoRepository.save(new Tratamiento("10/24/2024", "Control de enfermedades cardíacas"));


        //Drogas
        drogaRepository.save(new Droga("Paracetamol", 2,2,2,5));



        //Asociar veterinario con tratamiento
        
        int CANTIDAD_VETERINARIOS = 20;
        int CANTIDAD_VETERINARIOS_ASIGNAR = 1;
        for (Tratamiento tratamiento : tratamientoRepository.findAll()) {
            for (int i = 0; i < CANTIDAD_VETERINARIOS_ASIGNAR; i++) {
                int random = ThreadLocalRandom.current().nextInt(1, CANTIDAD_VETERINARIOS+1);
                System.out.println("NUMERO RANDOM: " + random + "DE: " + tratamiento.getId());
                Long search = Long.valueOf(random);
                System.out.println("SEARCH: " + search);
                Veterinario veterinario = veterinarioRepository.findById(search).get();
                tratamiento.setVeterinario(veterinario);
                tratamientoRepository.save(tratamiento);
            }
        }
        

        //Asociar tratamiento con Mascota
        
        int CANTIDAD_TRATAMIENTOS = 10;
        int CANTIDAD_TRATAMIENTOS_ASIGNAR = 1;
        for (Mascota mascota : mascotaRepository.findAll()) {
            for (int i = 0; i < CANTIDAD_TRATAMIENTOS_ASIGNAR; i++) {
                int random = ThreadLocalRandom.current().nextInt(1, CANTIDAD_TRATAMIENTOS+1);
                System.out.println("NUMERO RANDOM: " + random + "DE: " + mascota.getId());
                Long search = Long.valueOf(random);
                System.out.println("SEARCH: " + search);
                Tratamiento tratamiento = tratamientoRepository.findById(search).get();
                mascota.setTratamiento(tratamiento);
                mascotaRepository.save(mascota);
            }
        }

        //Asociar cliente con mascota
        Cliente asociar = clienteRepository.findById(1L).get();
        for (Mascota mascota : mascotaRepository.findAll()) {
            mascota.setCliente(asociar);
            mascotaRepository.save(mascota); 
        }

        int CANTIDAD_CLIENTES = 50;
        int CANTIDAD_CLIENTES_ASIGNAR = 2;

        for(Mascota mascota : mascotaRepository.findAll()) {
            System.out.println("ID MASCOTA REVISADA: " + mascota.getId());
            for (int i = 0; i < CANTIDAD_CLIENTES_ASIGNAR; i++) {
                int random = ThreadLocalRandom.current().nextInt(1, CANTIDAD_CLIENTES+1);
                System.out.println("NUMERO RANDOM: " + random + "DE: " + mascota.getId());
                Long search = Long.valueOf(random);
                System.out.println("SEARCH: " + search);
                Cliente cliente = clienteRepository.findById(search).get();
                mascota.setCliente(cliente);
                mascotaRepository.save(mascota);
            }
        }
        
    }
}
