package FamilyTree.model.writer;

import java.io.Serializable;


public interface Writer {
    void serializeFamily(Serializable serializable);

    Object deserializeFamily();

//    void setPath(String path);
}
