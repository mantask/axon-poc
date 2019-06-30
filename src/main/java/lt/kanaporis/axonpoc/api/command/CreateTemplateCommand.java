package lt.kanaporis.axonpoc.api.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CreateTemplateCommand {
    @TargetAggregateIdentifier
    private UUID templateId;
}