{ pkgs }: {
  deps = [
    pkgs.maven
    pkgs.bashInteractive
    pkgs.nodePackages.bash-language-server
    pkgs.man
  ];
}