package utils;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import models.Contact;

public class ContactoController {
    // Ordenado por Apellido > Nombre > Teléfono
    public Set<Contact> runTreeContacto() {
        Comparator<Contact> comparador = new ContactComparator();
        Set<Contact> agenda = new TreeSet<>(comparador);

        agenda.add(new Contact("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contact("Pablo", "Lopez", "222222222"));
        agenda.add(new Contact("Pedro", "Lopez", "222222222"));
        agenda.add(new Contact("Ana", "Perez", "987654321"));
        agenda.add(new Contact("Luis", "Perez", "111111111"));
        agenda.add(new Contact("Pedro", "Lopez", "123456789"));

        return agenda;
    }

    // Ordenado por Teléfono
    public Set<Contact> runTreeContactNum() {
        Comparator<Contact> comparador = Comparator.comparing(Contact::getTelefono);
        Set<Contact> agenda = new TreeSet<>(comparador);

        agenda.add(new Contact("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contact("Pablo", "Lopez", "222222222"));
        agenda.add(new Contact("Pedro", "Lopez", "222222222"));
        agenda.add(new Contact("Ana", "Perez", "987654321"));
        agenda.add(new Contact("Luis", "Perez", "111111111"));
        agenda.add(new Contact("Pedro", "Lopez", "123456789"));

        return agenda;
    }

    // Ordenado por HashCode
    public Set<Contact> runTreeContactHashCode() {
        Set<Contact> agenda = new TreeSet<>((c1, c2) -> {
            int result = Integer.compare(c1.getName().hashCode(), c2.getName().hashCode());
            if (result == 0) {
                result = Integer.compare(c1.getApellido().hashCode(), c2.getApellido().hashCode());
            }
            return result;
        });

        agenda.add(new Contact("Pedro", "Gonzales", "222222222"));
        agenda.add(new Contact("Ana", "Perez", "987654321"));
        agenda.add(new Contact("Luis", "Perez", "111111111"));
        agenda.add(new Contact("Pablo", "Lopez", "222222222"));
        agenda.add(new Contact("Pedro", "Lopez", "222222222"));
        agenda.add(new Contact("Pedro", "Lopez", "123456789"));

        return agenda;
    }
}