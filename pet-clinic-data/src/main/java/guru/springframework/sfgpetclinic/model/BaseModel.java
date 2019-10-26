package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseModel implements Serializable {

    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
