package symatique.smartseller.data.Ventes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/***************************************************************************
 *
 *                               NO IDEA
 *
 ***************************************************************************/

@DatabaseTable
public class Vente implements Serializable {

    @JsonProperty("id")
    @DatabaseField(id = true)
    private Long id;

    public Vente() {

    }
}
