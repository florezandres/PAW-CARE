
package com.example.pawcare.entidad;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.example.pawcare.repositorio.ClienteRepository;
import com.example.pawcare.repositorio.MascotaRepository;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    MascotaRepository mascotaRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
                // TODO Auto-generated method stub
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
        mascotaRepository.save(new Mascota("Luna", "15kg", "Labrador", "Displasia de cadera", "En tratamiento", 5, "/img/lucas.jpg"));
        mascotaRepository.save(new Mascota("Pablo", "1kg", "Desconocida", "Otitis", "Recuperado", 3, "/img/pablo.jpg"));
        mascotaRepository.save(new Mascota("Bella", "25kg", "Criollo", "Artritis", "En tratamiento", 7, "/img/jhony.jpg"));
        mascotaRepository.save(new Mascota("Rocky", "30kg", "Husky", "Alergia alimentaria", "En tratamiento", 4, "/img/miguel.jpg"));
        mascotaRepository.save(new Mascota("Coco", "4kg", "Pastor Aleman", "Problemas dentales", "Recuperado", 2, "/img/Zeus.jpg"));
        mascotaRepository.save(new Mascota("Coco", "4kg", "Pastor Aleman", "Problemas dentales", "Recuperado", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Max", "5kg", "Labrador", "Corte de orejas", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bella", "6kg", "Beagle", "Raspaduras", "En tratamiento", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Charlie", "7kg", "Bulldog", "Ojos irritados", "En observación", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "4kg", "Poodle", "Infección en la piel", "Recuperado", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lucy", "3kg", "Chihuahua", "Problemas respiratorios", "En tratamiento", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Molly", "8kg", "Boxer", "Cojera", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "9kg", "Rottweiler", "Diarrea", "En observación", 6, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sadie", "5kg", "Dachshund", "Corte en la pata", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Buddy", "4kg", "Cocker Spaniel", "Fiebre", "Recuperado", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "6kg", "Schnauzer", "Tos persistente", "En observación", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Toby", "7kg", "Pug", "Problemas de digestión", "En tratamiento", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jake", "3kg", "Shih Tzu", "Alergias", "Recuperado", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lola", "5kg", "Pomerania", "Raspaduras en la piel", "En observación", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bentley", "8kg", "Husky", "Dolores de estómago", "En tratamiento", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Duke", "9kg", "Akita", "Infección ocular", "Recuperado", 6, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oliver", "4kg", "Bichon Frise", "Herida en la pata", "En observación", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Chloe", "6kg", "Yorkshire Terrier", "Problemas de oído", "En tratamiento", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bear", "7kg", "Bernese Mountain Dog", "Infección urinaria", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "5kg", "Samoyedo", "Dolores musculares", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sophie", "8kg", "Golden Retriever", "Alergias alimentarias", "En tratamiento", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jack", "3kg", "Cavalier King Charles", "Problemas dentales", "Recuperado", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luna", "5kg", "Maltés", "Lesión en la cola", "En observación", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zoey", "6kg", "Pug", "Infección en las encías", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Mia", "7kg", "Dálmata", "Cortes menores", "Recuperado", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Loki", "8kg", "Weimaraner", "Problemas de piel", "En observación", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Gracie", "4kg", "Basset Hound", "Infección respiratoria", "En tratamiento", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rusty", "5kg", "Labrador", "Problemas articulares", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Harley", "6kg", "Terrier", "Problemas digestivos", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Misty", "7kg", "Beagle", "Herida en la pata", "En tratamiento", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oscar", "4kg", "Schnauzer", "Corte en la oreja", "Recuperado", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jasper", "8kg", "Boxer", "Fiebre alta", "En observación", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Penny", "5kg", "Pomerania", "Problemas oculares", "En tratamiento", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bailey", "6kg", "Cocker Spaniel", "Alergia estacional", "Recuperado", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maya", "7kg", "Poodle", "Dolores en el estómago", "En observación", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Winston", "4kg", "Husky", "Problemas dentales", "En tratamiento", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Roxy", "5kg", "Akita", "Corte en la pata", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lola", "8kg", "Mastín", "Fiebre leve", "En observación", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "6kg", "Shih Tzu", "Infección en el oído", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "7kg", "Dachshund", "Problemas en la piel", "Recuperado", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Ellie", "4kg", "Yorkshire Terrier", "Corte en la cola", "En observación", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sasha", "5kg", "Labrador", "Herida en el ojo", "En tratamiento", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "6kg", "Beagle", "Problemas respiratorios", "Recuperado", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Nala", "7kg", "Boxer", "Raspaduras menores", "En observación", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Milo", "5kg", "Schnauzer", "Infección en la piel", "En tratamiento", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zeke", "8kg", "Pug", "Dolores en las patas", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Stella", "6kg", "Pomerania", "Corte en la oreja", "En observación", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luca", "7kg", "Chihuahua", "Problemas de visión", "En tratamiento", 2, "/img/perroGenerico.png"));        
        mascotaRepository.save(new Mascota("Luca", "7kg", "Chihuahua", "Problemas de visión", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "4kg", "Shih Tzu", "Herida en la pata", "Recuperado", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jax", "6kg", "Rottweiler", "Infección en el oído", "En observación", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Mia", "7kg", "Maltés", "Corte en la cola", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Leo", "5kg", "Labrador", "Problemas articulares", "Recuperado", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luna", "8kg", "Beagle", "Fiebre leve", "En observación", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sasha", "4kg", "Cocker Spaniel", "Infección respiratoria", "En tratamiento", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Buddy", "6kg", "Poodle", "Dolores musculares", "Recuperado", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Roxy", "7kg", "Akita", "Problemas dentales", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "5kg", "Dachshund", "Corte en la pata", "En tratamiento", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oliver", "6kg", "Schnauzer", "Alergias estacionales", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Chloe", "8kg", "Pomerania", "Problemas oculares", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "5kg", "Pug", "Dolores de estómago", "En tratamiento", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bailey", "7kg", "Labrador", "Herida en el ojo", "Recuperado", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zara", "4kg", "Beagle", "Corte en la pata", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Toby", "5kg", "Bulldog", "Problemas dentales", "En tratamiento", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Nina", "6kg", "Boxer", "Fiebre alta", "Recuperado", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Dexter", "7kg", "Pomerania", "Raspaduras menores", "En observación", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Winnie", "8kg", "Rottweiler", "Infección urinaria", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Milo", "4kg", "Chihuahua", "Problemas digestivos", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rosie", "6kg", "Cocker Spaniel", "Herida en la cola", "En observación", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jasper", "7kg", "Schnauzer", "Corte en la oreja", "En tratamiento", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Lola", "5kg", "Shih Tzu", "Infección en la piel", "Recuperado", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "8kg", "Pug", "Problemas oculares", "En observación", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Benny", "4kg", "Labrador", "Corte en la pata", "En tratamiento", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "6kg", "Dachshund", "Fiebre baja", "Recuperado", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "7kg", "Beagle", "Infección respiratoria", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bella", "5kg", "Boxer", "Herida en la pata", "En tratamiento", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Luna", "8kg", "Poodle", "Problemas articulares", "Recuperado", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Jack", "4kg", "Cocker Spaniel", "Dolores de estómago", "En observación", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Zoey", "6kg", "Schnauzer", "Infección en el ojo", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Milo", "7kg", "Pomerania", "Problemas dentales", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Ruby", "5kg", "Labrador", "Fiebre leve", "En observación", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Max", "8kg", "Bulldog", "Corte en la pata", "En tratamiento", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sadie", "4kg", "Chihuahua", "Problemas de piel", "Recuperado", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Oliver", "6kg", "Beagle", "Infección en las encías", "En observación", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Riley", "7kg", "Rottweiler", "Dolores musculares", "En tratamiento", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Maggie", "5kg", "Pug", "Corte en la cola", "Recuperado", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Chloe", "8kg", "Akita", "Problemas digestivos", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bailey", "4kg", "Dachshund", "Herida en el ojo", "En tratamiento", 5, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Sophie", "6kg", "Boxer", "Infección respiratoria", "Recuperado", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Bella", "7kg", "Poodle", "Problemas articulares", "En observación", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Toby", "5kg", "Shih Tzu", "Dolores en el estómago", "En tratamiento", 4, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Rocky", "6kg", "Labrador", "Herida en la pata", "Recuperado", 1, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Roxy", "8kg", "Cocker Spaniel", "Fiebre baja", "En observación", 3, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Nina", "4kg", "Pug", "Infección en el ojo", "En tratamiento", 2, "/img/perroGenerico.png"));
        mascotaRepository.save(new Mascota("Daisy", "5kg", "Dachshund", "Problemas dentales", "Recuperado", 4, "/img/perroGenerico.png"));
                

        
        //Asociar cliente con mascota
        Cliente asociar = clienteRepository.findById(1L).get();
        for (Mascota mascota : mascotaRepository.findAll()) {
            mascota.setCliente(asociar);
            mascotaRepository.save(mascota); 
        }

        /*
        int CANTIDAD_MASCOTAS = 5;
        int CANTIDAD_MASCOTAS_ASIGNAR = 1;

        for(Cliente cliente : clienteRepository.findAll()){
            System.out.println("ID CLIENTE REVISADO: " + cliente.getId());
            for (int i = 0; i < CANTIDAD_MASCOTAS_ASIGNAR; i++) {
                int random = ThreadLocalRandom.current().nextInt(1, CANTIDAD_MASCOTAS+1);
                System.out.println("NUMERO RANDOM: " + random + "DE: " + cliente.getId());
                Long search = Long.valueOf(random);
                System.out.println("SEARCH: " + search);
                Mascota mascota = mascotaRepository.findById(search).get();
                mascota.setCliente(cliente);
                mascotaRepository.save(mascota);
            }
        }*/
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
