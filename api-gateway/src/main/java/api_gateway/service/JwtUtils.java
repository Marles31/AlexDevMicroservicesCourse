package api_gateway.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtUtils {
    private final String secretKet = "fdshfjdshfjdshfjh5h45hijfidwnfsdnvko39u453295u43nfsjdnvksdnvidsniksdnhgtihsdighsdfiusdahbfjsabnjfbhsajfbasjbhfjasbfjbsafjbsajfbjasbfjsabfjsabfjasbfjkbsfjk";

    public Claims getClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKet)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public boolean isExpired(String token) {
        try {
            return getClaims(token).getExpiration().before(new Date());
        } catch (Exception e) {
            return true;
        }
    }

    public Integer extractUserId(String token) {
        try {
            return Integer.parseInt(getClaims(token).getSubject());
        } catch (Exception e) {
            return null;
        }
    }
}
