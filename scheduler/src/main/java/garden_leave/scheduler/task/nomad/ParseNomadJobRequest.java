package garden_leave.scheduler.task.nomad;

import com.google.gson.annotations.SerializedName;

public class ParseNomadJobRequest {
  @SerializedName("JobHCL") public final String hcl;
  @SerializedName("Canonicalize") public final Boolean canonicalize;

  public ParseNomadJobRequest(final String hcl) {
    this(hcl, false);
  }

  public ParseNomadJobRequest(final String hcl, final boolean canonicalize) {
    this.hcl = hcl;
    this.canonicalize = canonicalize;
  }
}
