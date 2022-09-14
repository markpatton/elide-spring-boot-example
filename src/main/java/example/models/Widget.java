package example.models;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.yahoo.elide.annotation.Include;

@Include
@Entity
public class Widget {
    @Id
    private String name;

    private WidgetType type;
}
