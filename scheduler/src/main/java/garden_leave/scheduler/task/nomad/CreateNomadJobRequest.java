package garden_leave.scheduler.task.nomad;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class CreateNomadJobRequest {
  @SerializedName("Job") public final JsonObject jobSpec;
  @SerializedName("PolicyOverride") public final Boolean policyOverride;

  public CreateNomadJobRequest(final JsonObject jobSpec) {
    this(jobSpec, false);
  }

  public CreateNomadJobRequest(final JsonObject jobSpec, final boolean policyOverride) {
    this.jobSpec = jobSpec;
    this.policyOverride = policyOverride;
  }
}
