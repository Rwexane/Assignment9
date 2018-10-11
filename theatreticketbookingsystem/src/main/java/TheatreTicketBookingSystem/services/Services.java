package TheatreTicketBookingSystem.services;

/**
 * Created by User on 2017/11/04.
 */

import java.util.Set;

public interface Services<E,ID> {
    E create(E entity);

    E readById(ID id);

    Set<E> readAll();

    E update(E entity);

    void delete(E entity);

}

