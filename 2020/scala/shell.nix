let
  pkgs = import (fetchTarball
    "https://github.com/NixOS/nixpkgs/archive/cd63096d6d887d689543a0b97743d28995bc9bc3.tar.gz") {
      overlays = [
        (self: super: {
          sbt = super.sbt.overrideAttrs (old: rec { version = "1.4.4"; });
        })
      ];
    };

in pkgs.mkShell rec {
  name = "advent-of-code-2020-scala";
  buildInputs = [ pkgs.sbt ];
}
