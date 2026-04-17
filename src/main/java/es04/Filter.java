package es04;

public interface Filter {
    void doFilter(ServletRequest request,ServletResponse response,FilterChain filterChain);
}
