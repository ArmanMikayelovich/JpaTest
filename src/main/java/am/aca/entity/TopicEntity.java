package am.aca.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "topics", indexes = {
        @Index(name = "topics_topic_id_uindex",
                unique = true,
                columnList = "topic_id")

})
@Data
public class TopicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private int topicID;


    @Column(name = "topic_name", length = 256, nullable = false)
    private String topicName;

    @OneToMany(mappedBy = "topicEntity", cascade = CascadeType.ALL)
    private List<ChapterEntity> chapterEntityList;
}
