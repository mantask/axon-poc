package lt.kanaporis.axon.api.event;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class TemplateDeletedEvent {
    private UUID templateId;
}