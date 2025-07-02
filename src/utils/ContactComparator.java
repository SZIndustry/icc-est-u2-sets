package utils;

import java.util.Comparator;
import models.Contact;

public class ContactComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
        int apellidosComparator = c1.getApellido().compareTo(c2.getApellido());
        if (apellidosComparator != 0) {
            return apellidosComparator;
        }
        int nombresComparator = c1.getName().compareTo(c2.getName());
        if (nombresComparator != 0) {
            return nombresComparator;
        }
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}
