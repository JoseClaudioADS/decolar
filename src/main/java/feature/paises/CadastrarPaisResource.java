package feature.paises;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/paises")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class CadastrarPaisResource {

    @POST
    @Transactional
    public Response cadastrar(@Valid CadastrarPaisFormObject form) {

        Pais pais = form.toEntity();
        pais.persist();

        return Response.ok(pais).status(Response.Status.CREATED).build();
    }

}
