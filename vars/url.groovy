def call(String url, String branch)
{
  echo "Code cloning...."
  git url: "${url}", branch: "${branch}"
}
